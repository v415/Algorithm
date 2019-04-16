import java.io.File;
import java.util.List;

public class Upload {

	public static void main(String[] args) {
		
	}
//   protected void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException  {
//	// 判断表单的enctype值是不是"multipart/form-data"
//       boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
//       if (!isMultipartContent) {
//           throw new RuntimeException("your form is not multipart/form-data");
//       }
//       // 创建一个DiskFileItemfactory工厂类
//       DiskFileItemFactory factory = new DiskFileItemFactory();
//       // 创建一个ServletFileUpload核心对象
//       ServletFileUpload sfu = new ServletFileUpload(factory);
//       // 解析request对象，并得到一个表单项的集合
//       try {
//           List<FileItem> fileItems = sfu.parseRequest(request);
//           // 遍历表单项数据
//           for (FileItem fileitem : fileItems) {
//               if (fileitem.isFormField()) {
//                   // 普通表单项
//                   String fieldName = fileitem.getFieldName();
//                   String fieldValue = fileitem.getString();
//                   System.out.println(fieldName + "=====" + fieldValue);
//               } else {
//                   //上传表单项
//                   //得到文件输入流
//                   InputStream is = fileitem.getInputStream();
//                 //创建文件存储目录
//                   String directoryRealPath = this.getServletContext().getRealPath("WEB-INF/upload");
//                   //创建文件路径
//                   File storeDirectory = new File(directoryRealPath + File.separator + fileitem.getName());
//                   //使用apache commons-io包，将输入流转成文件
//                   FileUtils.copyInputStreamToFile(is, storeDirectory);
//               }
//           }
//
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
   }

