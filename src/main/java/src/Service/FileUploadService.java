package src.Service;

import com.cloudinary.Cloudinary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class FileUploadService implements FileUpload {
    private final Cloudinary cloudinary;

    @Override
    public String uploadFile(MultipartFile multipartFile) throws IOException {

        Map uploadResult = cloudinary.uploader().upload(
                multipartFile.getBytes(),
                Map.of("resource_type", "auto")
        );

        return (String) uploadResult.get("secure_url");
    }
}
