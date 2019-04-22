package com.simbirsoft.api.disk;

import com.simbirsoft.Config;
import com.simbirsoft.api.EndPoints;
import com.simbirsoft.api.models.MetainformationAboutDiskUser;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

import static com.simbirsoft.Config.API_HOST;
import static io.restassured.RestAssured.given;

public class DiskApi {

    private static final String basePath = EndPoints.disk;

    public DiskApi(){

    }

    public MetainformationAboutDiskUser GetAllMetainformationAboutDiskUser(){
        MetainformationAboutDiskUser metainformationAboutDiskUser = given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                header("Authorization", Config.TOKEN).
        when().
                get(API_HOST + basePath).
        then().
                statusCode(200).
                extract().
                body().
                as(MetainformationAboutDiskUser.class);
        return metainformationAboutDiskUser;
    }
}
