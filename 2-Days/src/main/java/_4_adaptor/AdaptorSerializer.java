package _4_adaptor;

import _4_adaptor.models.NewsData;

public class AdaptorSerializer implements IJsonSerializer {

    @Override
    public NewsData fncSerialize(String data) {
        CustomSerializer customSerializer = new CustomSerializer<>();
        return customSerializer.fncSerialize(data);
    }

}
