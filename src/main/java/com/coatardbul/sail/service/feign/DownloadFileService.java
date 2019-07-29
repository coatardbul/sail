
package com.coatardbul.sail.service.feign;

import com.coatardbul.sail.common.api.CommonResult;
import com.coatardbul.sail.feign.AreamFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: suxiaolei
 * @date: 2019/7/25
 */
@Service
public class DownloadFileService {
    @Autowired
    AreamFeign areamFeign;

    public CommonResult<Object> downloadFile()  {
        try {


            String filename = "1232";
            ResponseEntity<byte[]> responseEntity = areamFeign.downloadFile(filename);
            byte[] body = responseEntity.getBody();
            InputStream inputStream = new ByteArrayInputStream(body);
            InputStreamReader reader = new InputStreamReader(inputStream, "GBK");
            BufferedReader br = new BufferedReader(reader);

            List<String> list = new ArrayList<>();
            String line = "";
            String everyLine = "";
            while ((line = br.readLine()) != null) // 读取到的内容给line变量
            {
                everyLine = line;
              //  System.out.println(everyLine);
                String[] tjns = line.split("TJN");
              //  System.out.println(Arrays.toString(tjns));
                list.add(everyLine);
            }
            br.close();
            return CommonResult.success(responseEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed(new ResponseEntity<byte[]>(new byte[0],  HttpStatus.NOT_FOUND));
        }


    }
}
