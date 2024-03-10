package eastbound.yokijatiperkasa.kinotes.factory


class ViewModelFactory(
    private val repository: MyRepository // Dependensi yang dibutuhkan ViewModel
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MyViewModel::class.java)) {
            // Cek apakah class yang diminta sesuai dengan MyViewModel
            @Suppress("UNCHECKED_CAST")
            return MyViewModel(repository) as T // Casting aman dengan anotasi @Suppress
        }
        throw IllegalArgumentException("Unknown ViewModel class: $modelClass")
    }
}

