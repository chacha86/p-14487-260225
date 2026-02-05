public class Rq {

    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {

//        if (cmd.equals("삭제?id=1")) {
//            return "삭제";
//        }
//        if (cmd.equals("수정?id=1")) {
//            return "수정";
//        }

        return cmd.split("\\?")[0];
    }

    public String getParam(String key) {

        String param = cmd.split("\\?")[1];
        String paramKey = param.split("=")[0];

        if(paramKey.equals("keyword")) {
            return "자바";
        }
        if(paramKey.equals("keywordType")) {
            return "title";
        }

        return "";
    }
}