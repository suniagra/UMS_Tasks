package no.ums.interview;

/**
 * Helper class to convert a byte[] to Hex String.
 *
 * Source: http://stackoverflow.com/questions/9655181/convert-from-byte-array-to-hex-string-in-java
 *
 * @author Ståle Undheim <su@ums.no>
 */
public interface ByteHelper {

    char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

}
