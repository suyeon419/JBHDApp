package kr.ac.kumoh.ce.s20220822.jeonbuk

import retrofit2.http.GET
import retrofit2.http.Header

interface SupabaseApi {
    // Coach 테이블 데이터 가져오기
    @GET("rest/v1/coaches")
    suspend fun getCoaches(
        @Header("apikey") apiKey: String = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9nbW5naHdleW1td2p0cmttbnNhIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzQ2OTM1MjcsImV4cCI6MjA1MDI2OTUyN30.QRhd4NpEfwybNfuuh-6bMM3ScMVDdEW24og0c00BOoE",
        @Header("Authorization") authorization: String = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9nbW5naHdleW1td2p0cmttbnNhIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzQ2OTM1MjcsImV4cCI6MjA1MDI2OTUyN30.QRhd4NpEfwybNfuuh-6bMM3ScMVDdEW24og0c00BOoE"
    ): List<Coach>

    // Player 테이블 데이터 가져오기
    @GET("rest/v1/players")
    suspend fun getPlayers(
        @Header("apikey") apiKey: String = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9nbW5naHdleW1td2p0cmttbnNhIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzQ2OTM1MjcsImV4cCI6MjA1MDI2OTUyN30.QRhd4NpEfwybNfuuh-6bMM3ScMVDdEW24og0c00BOoE",
        @Header("Authorization") authorization: String = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Im9nbW5naHdleW1td2p0cmttbnNhIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MzQ2OTM1MjcsImV4cCI6MjA1MDI2OTUyN30.QRhd4NpEfwybNfuuh-6bMM3ScMVDdEW24og0c00BOoE"
    ): List<Player>
}
