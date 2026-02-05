public class Rq {

    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {

        return cmd.split("\\?")[0];
    }

    public String getParam(String key) {

        String param = cmd.split("\\?")[1];
        String paramKey = param.split("=")[0];
        String paramValue = param.split("=")[1];

        if(paramKey.equals(key)) {
            return paramValue;
        }

        return "";
    }
}