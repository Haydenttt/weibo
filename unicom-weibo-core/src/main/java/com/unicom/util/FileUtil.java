package com.unicom.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class FileUtil {
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
//        若目录不存在
        if (!targetFile.exists()) {
//            创建多级目录，无论是否存在父目录
            targetFile.mkdirs();
        }

        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(filePath + fileName));
        out.write(file);
        out.flush();
        out.close();
    }
}
