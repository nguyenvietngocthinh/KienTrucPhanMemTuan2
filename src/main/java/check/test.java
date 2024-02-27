package check;

import java.io.File;
import java.util.List;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;

public class test {
	void prinAllMethods(File javaFile) throws Exception {
		CompilationUnit cu = StaticJavaParser.parse(javaFile);
		List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);
		for (MethodDeclaration method : methods) {
			System.out.println(
					method.getType() + " " +
							method.getName());
		}
	}

	void prinAllFields(File javaFile) throws Exception {
		CompilationUnit cu = StaticJavaParser.parse(javaFile);
		List<MethodDeclaration> fields = cu.findAll(MethodDeclaration.class);
		for (MethodDeclaration field : fields) {
			System.out.println(field);
		}
	}

	public static void main(String[] args) throws Exception {

		File file = new File("F:\\ 20065261_NguyenVietNgocThinh_THTuan2\\src\\main\\java\\triangle\\Triangle.java");
		test ast = new test();
		ast.prinAllMethods(file);
		ast.prinAllFields(file);
	}

}
