package empire.stark.firststep.data;

/**
 * Created by YEN_MINH on 3/25/2017 3:35 AM.
 * Code and Life ( ^ .,,. ^ )
 * ---------------------------------------------
 */

public class YenMinh {
    private String mId;
    private String mTitle;

    public YenMinh(String mId, String mTitle) {
        this.mId = mId;
        this.mTitle = mTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getId() {
    
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }
}
