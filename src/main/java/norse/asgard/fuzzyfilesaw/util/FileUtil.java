package norse.asgard.fuzzyfilesaw.util;

import norse.asgard.fuzzyfilesaw.exceptions.FileSawProcessException;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

import static norse.asgard.fuzzyfilesaw.constants.FileConstants.FIELD_DELIMITER;

public class FileUtil {

    private FileUtil() {} //Utility class

    public static String[] parseSplitLineString(String line) {
        String[] splitted = Arrays.stream(line.split(FIELD_DELIMITER)).map(String::trim).toArray(String[]::new);

        if (splitted.length != 3) {
            throw new FileSawProcessException("Invalid format found in split delimiter");
        }

        return splitted;
    }

    public static String generateFileName(String fileName, String suffix) {
        StringBuilder sb = new StringBuilder();
        sb.append(fileName).append("_").append(suffix).append("_").append(FileUtil.getDateTimestamp());
        return sb.toString();
    }

    public static String getDateTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyyHHmm");
        sdf.setTimeZone(TimeZone.getDefault());
        return sdf.format(new Date());
    }

}
