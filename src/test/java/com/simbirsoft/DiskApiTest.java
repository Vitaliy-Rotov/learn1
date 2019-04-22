package com.simbirsoft;

import com.simbirsoft.api.disk.DiskApi;
import com.simbirsoft.api.models.MetainformationAboutDiskUser;
import org.testng.annotations.Test;

public class DiskApiTest {
    @Test
    public void getMetainformationAboutDiskUserTest() {
        MetainformationAboutDiskUser metainformationAboutDiskUser = new DiskApi().GetAllMetainformationAboutDiskUser();
    }
}
