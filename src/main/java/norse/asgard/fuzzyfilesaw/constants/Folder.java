package norse.asgard.fuzzyfilesaw.constants;

public enum Folder {

    PROCESSING{
        @Override
        public String getFolderName() {
            return PROCESSING.toString().toLowerCase();
        }
    },
    ARCHIVED{
        @Override
        public String getFolderName() {
            return ARCHIVED.toString().toLowerCase();}
    },
    ERROR{
        @Override
        public String getFolderName() {
            return ERROR.toString().toLowerCase();}
    },
    TEMP{
        @Override
        public String getFolderName() {
            return ERROR.toString().toLowerCase();}
    };

    public abstract String getFolderName();
}
