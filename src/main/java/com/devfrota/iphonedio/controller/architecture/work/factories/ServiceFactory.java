package com.devfrota.iphonedio.controller.architecture.work.factories;

import com.devfrota.iphonedio.controller.architecture.services.ServiceApp;
import view.view_config.DevConfigLanguage;
import view.view_config.DevConfigView;

public class ServiceFactory {
	

    public static DevConfigView sView() {
        DevConfigView sv = new DevConfigView();
        return sv;
    }
    public static DevConfigLanguage sLang() {
        DevConfigLanguage sl = new DevConfigLanguage();
        return sl;
    }
    public static ServiceApp sApp() {
        ServiceApp servApp = new ServiceApp();
        return servApp;
    }

 }
