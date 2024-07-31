package com.nontage;

import com.google.gson.annotations.SerializedName;

public class ApiResponse {
    @SerializedName("success")
    boolean success;
    @SerializedName("result")
    Result result;
}
