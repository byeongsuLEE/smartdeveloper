
import java.io.IOException;
import java.util.Scanner;

public class MusicMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();
		
		
		while(true)
		{
			System.out.print("1.��� 2.���� 3.������ 4.������ 5.���� >> ");
			int x = sc.nextInt();
			if(x==1)
			{
				//�뷡���
				MusicVo m = player.play();
				int minute = m.getPlayTime()/60;
				int second = m.getPlayTime()-(minute*60);
				System.out.println(m.getMusicName()+", "+m.getSinger()+", " + minute+"��"+second+"��");
			
				
				
			}
			else if(x==2)
			{
				
				System.out.println((player).stop());
			}
			else if(x==3)
			{
				
				MusicVo m = player.nextPlay();
				
				int minute = m.getPlayTime()/60;
				int second = m.getPlayTime()-(minute*60);
				System.out.println(m.getMusicName()+", "+m.getSinger()+", " + minute+"��"+second+"��");
			}
			else if (x==4)
			{
				MusicVo m = player.beforePlay();
				int minute = m.getPlayTime()/60;
				int second = m.getPlayTime()-(minute*60);
				System.out.println(m.getMusicName()+", "+m.getSinger()+", " + minute+"��"+second+"��");
			}
			else if (x==5)
			{
				System.out.print("����");
				break;
			}
		}

	}

}
