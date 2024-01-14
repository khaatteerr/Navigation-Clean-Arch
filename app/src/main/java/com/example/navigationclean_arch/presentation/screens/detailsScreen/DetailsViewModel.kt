package com.example.navigationclean_arch.presentation.screens.detailsScreen

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.navigationclean_arch.presentation.utilities.Constants.WOOL_DETAILS_ID
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
):ViewModel() {
    /* this is ID that we send it to details screen
       so we acn hit the API to get all wool details.
       make args as private but i make it public to print it in details screen when navigate
     */
     val args: String = checkNotNull(savedStateHandle[WOOL_DETAILS_ID]?:"")
    /*
    * complete your code here with your useCases like that
    * getWoolDetailsUseCase.invoke(args) -> this useCase used to get all wool details.
    * you can check the code here of my wool app.
    * but API not working currently
    * */

}