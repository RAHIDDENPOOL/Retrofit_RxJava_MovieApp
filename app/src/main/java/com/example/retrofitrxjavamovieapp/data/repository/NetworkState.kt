package com.example.retrofitrxjavamovieapp.data.repository

enum class Status {
    RUNNING,
    SUCCESS,
    FAILED
}

class NetworkState(val status: Status, val msg: String) {
    companion object {
        val LOADER: NetworkState
        val LOADING: NetworkState
        val ERROR: NetworkState

        init {
            LOADER = NetworkState(Status.SUCCESS, "Загрузил, проверяй")
            LOADING = NetworkState(Status.RUNNING, "Загрузка...")
            ERROR = NetworkState(Status.FAILED, "Шота не плучаеца :э")
        }
    }
}