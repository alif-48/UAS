package id.ac.amikom.githubuserapi.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class User (
    val login: String,
    val avatarUrl: String,
    val htmlUrl: String,
    val followersUrl: String,
    val followers : Int ,
    val followingsUrl : String,
    val following : Int,
    val reposUrl : String,
    val repos : Int


): Parcelable