
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;


public class qrcode {
    
    private static final String outputQr = "C:\\Users\\aianl\\Desktop\\Attendance Monitoring System\\QR Code\\outputqrcode.png";
    
    private static void generateQRcode(String text, int width, int height, String filePath) throws WriterException{
     
        QRCodeWriter qc = new QRCodeWriter();
        BitMatrix bm = qc.encode(text,BarcodeFormat.QR_CODE,width, height);
        Path pobj = FileSystems.getDefault().getPath(filePath);
        try{
            MatrixToImageWriter.writeToPath(bm, "PNG", pobj);
        } catch(IOException ex){
            Logger.getLogger(qrcode.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    public static void main(String[] args) throws WriterException {
        generateQRcode("AianLouise", 1250, 1250, outputQr);
    }
}
