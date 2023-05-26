package com.example.aisle.presenter.views.ui.notes

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.ObservableArrayList
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.request.RequestOptions
import com.example.aisle.data.model.AvatarProfiles
import com.example.aisle.data.model.NotesResponseModel
import com.example.aisle.databinding.FragmentNotesBinding
import com.example.aisle.presenter.viewModel.MainViewModel
import com.example.aisle.presenter.views.MainActivity
import com.example.aisle.presenter.views.adapter.ProfileAdapter
import com.example.aisle.utils.Resource
import dagger.hilt.android.AndroidEntryPoint
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

@AndroidEntryPoint
class NotesFragment : Fragment() {

    private var _binding: FragmentNotesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    lateinit var viewModel: MainViewModel
    lateinit var adapter: ProfileAdapter
    var profileList = ObservableArrayList<AvatarProfiles>()
    private var token: String? = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentNotesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        viewModel = (activity as MainActivity).viewModel
        token = viewModel.getToken()
        viewModel.postNotesApi()
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setObservable()
    }


    private fun setObservable() {
        viewModel._NotesResponseLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    binding.progress.setVisibility(false)
                    it.message?.let { message ->
                        Toast.makeText(context, "An error occurred $message", Toast.LENGTH_LONG)
                            .show()
                    }
                }

                is Resource.Loading -> {
                    binding.progress.setVisibility(true)
                }

                is Resource.Success -> {
                    binding.progress.setVisibility(false)
                    if (it.data != null) {
                        setData(it.data)
                    }
                }
            }
        }
    }

    private fun setData(data: NotesResponseModel) {
        if (data.likes?.profiles != null && data.likes?.profiles!!.isNotEmpty()) {
            profileList.addAll(
                data.likes?.profiles!!
            )
            Log.d("TAG", "setData:${data.likes?.profiles}")
            adapter = ProfileAdapter(profileList)
            binding.rvImage.adapter = adapter
            binding.rvImage.layoutManager = GridLayoutManager(context, 2)
        }
        val multi = MultiTransformation(
            RoundedCornersTransformation(10, 0, RoundedCornersTransformation.CornerType.BOTTOM)
        )
        context?.let {
            Glide.with(it).load(data.invites?.profiles?.get(0)?.photos?.get(0)?.photo)
                .apply(RequestOptions.bitmapTransform(multi))
                .into(binding.ivImage)
        }
        binding.tvName.text = data.invites?.profiles?.get(0)?.generalInformation?.firstName
    }


    private fun View.setVisibility(isVisible: Boolean = false) {
        this.visibility = if (isVisible) View.VISIBLE else View.GONE
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}