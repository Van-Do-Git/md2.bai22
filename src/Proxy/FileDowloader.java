package Proxy;

public class FileDowloader implements Dowloader{
    private String userAgent;

    public FileDowloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void dowloader(String url, String path) {
        System.out.println("Da dowloat tu "+url+" den "+path+ " bang "+userAgent);
    }
}
