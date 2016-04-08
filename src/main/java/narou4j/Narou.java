package narou4j;

import narou4j.networks.NarouApiClient;
import okhttp3.Call;

import java.io.IOException;
import java.util.List;

public class Narou extends GetParameter {

    private NarouApiClient client;

    public Narou() {
        params.put("out", "json");
    }

    public List<Novel> getNovels() {
        client = new NarouApiClient();

        return Utils.response2Json(client.getNovels(params));
    }
}
