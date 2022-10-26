import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
	ArrayList<MusicVo> musicList =new ArrayList<MusicVo>();
	int currentIndex = 0 ;
	MP3Player mp3 = new MP3Player();
	public MusicPlayer()
	{
		musicList.add(new MusicVo("DallaDalla","Itzy",100,"C://music/Itzy - Dalla Dalla.mp3"));
		musicList.add(new MusicVo("��","Rain",120,"C://music/Rain - ��.mp3"));
		musicList.add(new MusicVo("SOLO","Jennie",200,"C://music/JENNIE - SOLO.mp3"));
		
	}
	public MusicVo play()
	{
		//0���� �ε��� ��ȯ�ϱ�
		MusicVo m = musicList.get(currentIndex);
		if(mp3.isPlaying())
		{
			mp3.stop();
		}
		mp3.play(m.getMusicPath());
		return m;
		
	}
	public MusicVo nextPlay()
	{
		this.currentIndex++;
		if(this.currentIndex>=musicList.size())
		{
			this.currentIndex=0;
		}
		return this.play();
	}
	public MusicVo beforePlay()
	{
		this.currentIndex--;
		if(this.currentIndex <0) {
			this.currentIndex=musicList.size()-1;
		}
		return this.play();
	}
	public String stop() {
		if(mp3.isPlaying())
		{
			mp3.stop();	
		}
		
		return "�뷡�� �����Ǿ����ϴ�.";
	}
	
}
