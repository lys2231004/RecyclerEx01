package merong.com.recyclerex01;

public class PostItem {
    private String imgUrl;
    private String tit;
    private Boolean likeChk;
    private Boolean shareChk;

    public String getImgUrl() {
        return imgUrl;
    }

    public String getTit() {
        return tit;
    }

    public Boolean getLikeChk() {
        return likeChk;
    }

    public void setLikeChk(Boolean likeChk) {
        this.likeChk = likeChk;
    }

    public Boolean getShareChk() {
        return shareChk;
    }

    public void setShareChk(Boolean shareChk) {
        this.shareChk = shareChk;
    }

    public PostItem(String imgUrl, String tit, Boolean likeChk, Boolean shareChk) {
        this.imgUrl = imgUrl;
        this.tit = tit;
        this.likeChk = likeChk;
        this.shareChk = shareChk;
    }
}
