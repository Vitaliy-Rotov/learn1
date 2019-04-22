package com.simbirsoft;

import com.simbirsoft.api.disk.DiskApi;
import com.simbirsoft.api.models.MetainformationAboutDiskUser;
import com.simbirsoft.api.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiskApiTest {
    @Test
    public void getMetainformationAboutDiskUserTest() {
        MetainformationAboutDiskUser metainformationAboutDiskUser = new DiskApi()
                .GetAllMetainformationAboutDiskUser();
        assertEquals(metainformationAboutDiskUser.getUser().getCountry(), "ru");
        assertEquals(metainformationAboutDiskUser.getUser().getLogin(), "autotest4");
        assertEquals(metainformationAboutDiskUser.getUser().getDisplayName(), "autotest4");
        assertEquals(metainformationAboutDiskUser.getUser().getUid(), "476617890");
    }
}
