# Aisle

Project 1: Aisle has millions of users from over 150 countries. Each user gets 10 free daily
Likes. Unused Likes are not carried forward to the next day. We must refresh the number of daily
Likes at 12:00 pm according to the user's local time.

How would you go about doing this in a scalable way? No need to write code, simply explain to us in
theory the backend logic in your own words.

Ans:-
To implement the backend logic for refreshing the number of daily likes in a scalable way for the
Aisle app, we can consider the following approach:

1. User Tracking:
    - Maintain a user database that stores user information, including their timezone and the number
      of remaining daily likes.
    - When a user signs up or logs in, store their timezone in their user profile.
    - Keep track of the number of daily likes consumed by each user.

2. Timezone Conversion:
    - Whenever a user performs an action that requires updating the number of daily likes, retrieve
      their timezone from the user profile.
    - Convert the current server time to the user's local time using timezone conversion techniques.
    - Compare the converted local time with the predefined refresh time (12:00 pm).
    - If the converted local time is after the refresh time, proceed with refreshing the number of
      daily likes.

3. Daily Likes Refresh:
    - At the predefined refresh time (12:00 pm), trigger a backend process to refresh the number of
      daily likes for all users.
    - Iterate through each user and reset their daily likes counter to the maximum limit of 10.
    - Update the user's remaining daily likes count in the user database.

4. Considerations for Scalability:
    - To handle millions of users from different timezones, distribute the load across multiple
      servers or use a scalable cloud-based infrastructure.
    - Optimize database queries and ensure efficient retrieval and update of user data.
    - Implement caching mechanisms to minimize the database load and improve performance.
    - Employ efficient algorithms and data structures to handle the large user base and perform
      operations in a timely manner.

By following this approach, the backend logic ensures that each user's daily likes are refreshed
according to their local time at 12:00 pm. It takes into account the user's timezone, updates the
likes counter, and maintains scalability to handle a large user base across different countries.

Project 2: Code these 3 screens from this Figma file in Kotlin.

Design: https://www.figma.com/file/Mh6Jb8gBxT9MewfWkKNwOV/Tech-Challenge?node-id=0%3A1

Description

Screen 1: Enter +91 in the country code field and 9876543212 in the phone number field and click on
the Continue button. While clicking on the Continue button make a Phone number API call, Once you
get success response then take the user to Screen 2.

Screen 2: Enter 1234 in the OTP field and click on the Continue button. While clicking on the
Continue button, make an OTP API call, You will receive an auth token in the API success response
then take the user to Screen 3.

Screen 3: Add auth token in the header while making Notes API call.


