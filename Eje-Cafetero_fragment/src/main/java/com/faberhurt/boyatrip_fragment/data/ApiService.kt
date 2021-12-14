package com.faberhurt.boyatrip_fragment.data

import com.faberhurt.boyatrip_fragment.model.SitiosInteres
import retrofit2.http.GET

interface ApiService {

    @GET("edwinbermudez7/Golden-JFDHER/sitiosInteres")
    suspend fun getSitiosinteres(): SitiosInteres
}