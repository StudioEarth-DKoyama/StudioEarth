package uriage;

import java.util.List;

import uriageEntity.Branch;
import uriageEntity.Commodity;


public class Main {
	public static void main(String[] args) {

		ReadFile rf = new ReadFile();

		//ファイルの存在チェック
		List<String> rcdList = rf.checkFile();

		//支店定義ファイルを読み込む
		List<Branch> braList = rf.readBranch();

		//商品定義ファイルを読み込む
		List<Commodity> comList = rf.readCommodity();

		//売上ファイルを読み込み集計を行う
		Calculate cal = new Calculate();
		cal.calculate(braList, comList, rcdList);

		//データベースへ登録を行う

	}

}
