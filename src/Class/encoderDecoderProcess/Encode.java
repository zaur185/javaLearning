package Class.encoderDecoderProcess;

import java.util.Base64;

public class Encode extends Encryption implements EncoderAction {

    @Override
    public void Encoding(String input) {
        this.originalInput = input;

        String  decodeOutput = new String(Base64.getEncoder().encodeToString(originalInput.getBytes()));

        System.out.println(decodeOutput);

        this.originalInput = null;
    }
}
