package process_management;
public class ProcessInfo {
    private int processId;
    private String imageName;
    private String sessionName;
    private String memoryUsage;
    private int sessionNumber;

    public ProcessInfo() {
    }

    public ProcessInfo(String lineData) {
        //tách chuỗi
        String data[] =  lineData.split("\\s{2,}");
        //tách tiếp từ cột session name và PID
        String dataPIdAndSessionName[] = data[1].split("\\s");
        imageName = data[0];
        processId =Integer.parseInt( dataPIdAndSessionName[0]);
        sessionName = dataPIdAndSessionName[1];
        sessionNumber =Integer.parseInt( data[2]);
        memoryUsage = data[3];

    }

    public ProcessInfo(int processId, String imageName, String sessionName, String memoryUsage) {
        this.processId = processId;
        this.imageName = imageName;
        this.sessionName = sessionName;
        this.memoryUsage = memoryUsage;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getSessionName() {
        return sessionName;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public String getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(String memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }
}
