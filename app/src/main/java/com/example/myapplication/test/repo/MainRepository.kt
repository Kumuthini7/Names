package com.example.myapplication.test.repo

import com.example.myapplication.test.model.Response

/**
 * Created by Kumuthini.N on 10-08-2020
 */
interface MainRepository {
  fun getResponse(onSuccess: (response: Response) -> Unit, onFailure: (t: Throwable) -> Unit)
}
