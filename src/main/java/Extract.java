import Utils.GeraCSV;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Report;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static Utils.Hooks.*;

public class Extract {

    public Report report = new Report();
    public GeraCSV csv = new GeraCSV();

        public static void main(String[] args) throws IOException {
            Extract ext = new Extract();
            ext.readFile(ext.getResultFiles());
        }

        public void readFile(List files) throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();
            int i = 1;
            while(i < files.size()) {
                report = objectMapper.readValue(new File(files.get(i).toString()), Report.class);
                System.out.println( report.getName());
                csv.dataLines.add(new String[]{ report.getName(), report.getStatus(), report.getExtra().getTags().toString()});
                i++;
            }
            csv.createCsvFile();
        }

        public List getResultFiles(){
            List<String> fileList = null;
            loadProperties();
            try (Stream<Path> walk = Files.walk(Paths.get(prop.getProperty("pathFile")))) {
                fileList = walk.map(x -> x.toString()).collect(Collectors.toList());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return fileList;
        }
    }

