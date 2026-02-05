public class Rq {

    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {

        return cmd.split("\\?")[0];
    }

    public String getParam(String key) {

        String params = cmd.split("\\?")[1];

        for(String param : params.split("&")) {
            String paramKey = param.split("=")[0];
            String paramValue = param.split("=")[1];

            if(paramKey.equals(key)) {
                return paramValue;
            }
        }

        return "";
    }
}