package cn.itcast.idea.basicplus.threads.baozi;

/**
 * 包子 class
 *
 * @author hzx
 * @date 2020-04-25
 */
public class BaoZi {

    /**
     * 皮
     */
    private String pi;

    /**
     * 馅
     */
    private String xian;

    /**
     * 包子的状态 true/false 默认为false
     */
    private boolean flag = false;

    public BaoZi() {
    }

    public BaoZi(String pi, String xian, boolean flag) {
        this.pi = pi;
        this.xian = xian;
        this.flag = flag;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
