import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		sc = new Scanner(System.in);
		String command = sc.next();
		String srcfile = sc.next();
		String destFile = sc.next();
		//System.out.println(command+" "+srcfile+" "+destFile);
		Copy(command,srcfile,destFile);
	}

	private static void Copy(String command, String srcfile, String destFile) throws IOException {
		File src = new File(srcfile);
		File dest = new File(destFile);
		if(command.equals("javaCopy")){
			if(src.exists()){
				FileInputStream fis = new FileInputStream(src);
				FileOutputStream fos = new FileOutputStream(dest);
				byte[] b = new byte[1024];
				int len;
				while((len=fis.read(b))!=-1){
					fos.write(b, 0, len);
				}
				fis.close();
				fos.close();
			}
			else{
				System.out.println("拷贝文件不存在！");
			}
		}
		else{
			System.out.println("命令错误！");
		}
	}

}


