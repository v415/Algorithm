import java.io.File;
import java.util.List;

public class Upload {

	public static void main(String[] args) {
		
	}
//   protected void doPost(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException  {
//	// �жϱ���enctypeֵ�ǲ���"multipart/form-data"
//       boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
//       if (!isMultipartContent) {
//           throw new RuntimeException("your form is not multipart/form-data");
//       }
//       // ����һ��DiskFileItemfactory������
//       DiskFileItemFactory factory = new DiskFileItemFactory();
//       // ����һ��ServletFileUpload���Ķ���
//       ServletFileUpload sfu = new ServletFileUpload(factory);
//       // ����request���󣬲��õ�һ������ļ���
//       try {
//           List<FileItem> fileItems = sfu.parseRequest(request);
//           // ������������
//           for (FileItem fileitem : fileItems) {
//               if (fileitem.isFormField()) {
//                   // ��ͨ����
//                   String fieldName = fileitem.getFieldName();
//                   String fieldValue = fileitem.getString();
//                   System.out.println(fieldName + "=====" + fieldValue);
//               } else {
//                   //�ϴ�����
//                   //�õ��ļ�������
//                   InputStream is = fileitem.getInputStream();
//                 //�����ļ��洢Ŀ¼
//                   String directoryRealPath = this.getServletContext().getRealPath("WEB-INF/upload");
//                   //�����ļ�·��
//                   File storeDirectory = new File(directoryRealPath + File.separator + fileitem.getName());
//                   //ʹ��apache commons-io������������ת���ļ�
//                   FileUtils.copyInputStreamToFile(is, storeDirectory);
//               }
//           }
//
//       } catch (Exception e) {
//           e.printStackTrace();
//       }
   }

