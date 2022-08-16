package com.example.testapplication.ui

import com.example.testapplication.repository.AppRepository
import com.example.testapplication.viewmodel.RepositoryViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito

@RunWith(JUnit4::class)
class repoViewModelTest {


    private lateinit var repoViewModel: RepositoryViewModel
    private lateinit var repositoryRepo : AppRepository
    val testDispatcher = TestCoroutineDispatcher()

    /*@get:Rule
    val instantTaskExecutionRule: InstantTaskExecutorRule = InstantTaskExecutorRule()*/

   /* @OptIn(ExperimentalCoroutinesApi::class)
    @Before
    fun initSetUp(){
        Dispatchers.setMain(testDispatcher)
        repositoryRepo = Mockito.mock(AppRepository::class.java)
        repoViewModel = RepositoryViewModel(repositoryRepo)
    }*/

   /* @Test
    fun checkLoadingState_OnRequestInit_isTrue(){
        repoViewModel.setLoadingState(true)
        Truth.assertThat(repoViewModel.isLoading.value).isEqualTo(true)
    }*/

/*
    @Test
    fun checkLoadingState_OnRequestComplete_isFalse(){
        repoViewModel.setLoadingState(false)
        Truth.assertThat(repoViewModel.isLoading.value).isFalse()
    }*/

   /* @Test
    fun onResponseReceived_checkFailedState_isError(){
        mockito.`when`(loginrepo.validatelogindetails("test@test.com","13")).thenreturn(null)
        loginviewmodel.onloginclick("test@test.com","13")
        Truth.assertThat(repoViewModel.error.value).isNotNull()
        Truth.assertThat(repoViewModel.isLoading.value).isEqualTo(false)
    }*/

    /*@Test
    fun onResponseReceived_checkSuccessState_isSuccess(){
        mockito.`when`(repositoryRepo.validatelogindetails("test@test.com","123")).thenreturn(LoginResponse())
        loginviewmodel.onloginclick("test@test.com","123")
        Truth.assertThat(repoViewModel.responseDataLD.value !=null)
        Truth.assertThat(repoViewModel.error.value.isNullOrBlank()).isEqualTo(true)
        Truth.assertThat(repoViewModel.isLoading.value).isEqualTo(false)
    }*/
/*
    @After
    fun tearDown() {
        Dispatchers.resetMain()
        testDispatcher.cleanupTestCoroutines()
    }*/


}