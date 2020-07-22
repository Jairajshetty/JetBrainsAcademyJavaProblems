import java.util.Arrays;
class AsciiCharSequence implements java.lang.CharSequence {
    private byte[] arr;
    public AsciiCharSequence(byte[] arr){
        this.arr=arr;
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public char charAt(int index) {
        return (char)arr[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(arr,start,end));
    }

    @Override
    public String toString() {
        return new String(arr);
    }
}
