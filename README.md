# BranStation23_Test_Assesment

 A Test App Featuring MVVM, Koin, Navigation Component, Retrofit, kotlin Coroutine, Unit Test, API response handling programatically in ViewModel

# Architecture
- MVVM Architecture (View - ViewModel - Model, repository)
- LiveData 
- Jetpack Compose
- Navigation & UI
- AndroidX library


# List of UI and Required Functions
 - A list of repositories page where list of repositories showed.
- List fetched from https://api.github.com/ api using "Android" as query keyword.
- List can be sorted by either last update date time or star count.
- Selected sorting option persists in further app sessions.
- A repo details page, to which navigated by clicking on an item from the list.
- Details page shows repo owner's name, photo, repository's description, last update date
  time in month-day-year hour:seconds format, each field in 2 digit numbers.
- The repository which loaded once, is saved for offline browsing.

- Implemented features using best practices of Android Development
- have usaged of Kotlin coroutine
- have usaged of jetpack navigation components
- unit test coverage
- have UI testing coverage

# Cache
- used for temporarily storing data fetched from a network on a device's storage, for showing the data later in offline.
we can evn use Room & Sharedpreferences for stooring the data locally ,

