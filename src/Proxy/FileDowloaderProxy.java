package Proxy;

public class FileDowloaderProxy implements Dowloader {
    private FileDowloader fileDowloader;

    public FileDowloaderProxy() {
        this.fileDowloader = new FileDowloader("GogleChrome");
    }

    @Override
    public void dowloader(String url, String path) {
        fileDowloader.dowloader(url, path);
    }

    public static void main(String[] args) {
        Dowloader demo = new FileDowloaderProxy();
        String url = "vnexpress.com";
        String path = "File Codegyem";
        demo.dowloader(url,path);
    }
}


