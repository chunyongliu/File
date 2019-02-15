package Tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
/**
 * 
 *这是一个工具类，目的是为了输入任何目录，遍历其下面的所有文件和文件夹
 */
	//获取文件夹的所有文件
	static boolean a = true;
	public static List getAllFiles(String dir){
		//创建一个集合来保存遍历的File
		List<File>files=new ArrayList<>();
		File file=new File(dir);//文件夹必须存在
		if(file.exists()&&file.isDirectory()){//文件夹存在，并且是文件夹
			//循环比遍历
			fileRound(file,files);//定义的方法，把遍历的结果放到集合里
		}
		return files;//返回list的集合
	}
		/**
		 * fileround 是一个递归方法，不断调用本身 
		 */
		private static void fileRound(File file,List<File> files){
			File[] fillAll=file.listFiles();//返回的是文件夹和 文件夹的路径，返回File对象
			if(fillAll==null){//如果文件夹是空的
				System.out.println("_____________________");
				return;//跳出方法，后面的不会执行
				
			}
			System.out.println("111111111111");
			//如果文件夹有内容，需要去遍历里卖弄所有的文件和文件夹
			for(File file2:fillAll){
				files.add(file2);
				fileRound(file2,files);
				System.out.println("232423423");
			}
			System.out.println("_____________________");
			
		}
		
			
		
}
