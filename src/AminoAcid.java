
public class AminoAcid {
	public static void main(String[] args) {
		System.out.println("アミノ酸を覚えよう！");
		for(int i = 0; i < 5; i++) {
			System.out.print("1〜20までの数字を入力してください：");
			int selected = new java.util.Scanner(System.in).nextInt();
			switch(selected) {
				case 1:
					System.out.println("アラニン");
					break;
				case 2:
					System.out.println("セリン");
					break;
				case 3:
					System.out.println("フェニルアラニン");
					break;
				case 4:
					System.out.println("バリン");
					break;
				case 5:
					System.out.println("イソロイシン");
					break;
				case 6:
					System.out.println("トレオニン");
					break;
				case 7:
					System.out.println("アスパラギン");
					break;
				case 8:
					System.out.println("システイン");
					break;
				case 9:
					System.out.println("プロリン");
					break;
				case 10:
					System.out.println("グリシン");
					break;
				case 11:
					System.out.println("メチオニン");
					break;
				case 12:
					System.out.println("ロイシン");
					break;
				case 13:
					System.out.println("グルタミン酸");
					break;
				case 14:
					System.out.println("ヒスチジン");
					break;
				case 15:
					System.out.println("グルタミン");
					break;
				case 16:
					System.out.println("アスパラギン酸");
					break;
				case 17:
					System.out.println("リシン");
					break;
				case 18:
					System.out.println("トリプトファン");
					break;
				case 19:
					System.out.println("アルギニン");
					break;
				case 20:
					System.out.println("チロシン");
					break;
				default:
					System.out.println("1〜20までの数字を入力してください！");
					break;
			}
		}
		System.out.println("クイズを終了します");
	}

}
