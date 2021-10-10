package Class.encoderDecoderProcess;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Decode extends Encryption implements DecoderAction{
    @Override
    public void Decoding(String input) {
        this.originalInput = input;

        String  encodeOutput = new String(Base64.getDecoder().decode(originalInput));

        System.out.println(encodeOutput);

        this.originalInput = null;
    }
}
