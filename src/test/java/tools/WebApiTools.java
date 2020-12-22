package tools;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.util.concurrent.TimeUnit;

public class WebApiTools {

    public static class WebAPITools {
        private String urlToken;
        private String cookie;
        private String webinar = "webinarru://mobile-alpha-api.webinar.ru/event/";
        private static String webinarToken = "webinarru://mobile-alpha-api.webinar.ru?token=";
        public String token;
        private String adminMail = "a.khramov@webinar.ru";
        private String adminMailPart = "a.khramov";
        private String adminPassword = "123456";
        private String email;
        public static String devicePlatform = "fastReset";
        private static String CONTEXT_NATIVE_APP = "NATIVE_APP";
        private static String CONTEXT_CHROMIUM = "CHROMIUM";
        int webinarId;
        int eventsessionId;
        OkHttpClient client;
        RequestBody reqbodyNull;
        long createWebinarUserID;
        String serverUrl = "https://alpha.webinar.ru";
        private boolean isRegistred = false;

        public WebAPITools(String adminMailPart, String email, String serverUrl) {
            this.adminMailPart = adminMailPart;
            this.email = email;
            this.adminMail = adminMailPart + "@test.webinar.ru";
            this.serverUrl = serverUrl;
            client = new OkHttpClient.Builder()
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .writeTimeout(30, TimeUnit.SECONDS)
                    .readTimeout(5, TimeUnit.MINUTES)
                    .followRedirects(false)
                    .followSslRedirects(false)
                    .addInterceptor(chain -> {
                        final Request original = chain.request();

                        final Request authorized = original.newBuilder()
//                            .addHeader("Cookie", "cookie-name=cookie-value")
                                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64; rv:45.0) Gecko/20100101 Firefox/45.0")
                                .build();

                        return chain.proceed(authorized);
                    })
                    .build();
            this.reqbodyNull = RequestBody.create(null, new byte[0]);

        }
    }
}
