package exam1105;

public class MemoExample {

	public static void main(String[] args) {
		MemoRepository localRepo = new LocalRepositotry();
		localRepo.addMemo("1", "Local Memo Body");
		localRepo.getMemo();
		localRepo.updateMemo("1", "Updated Local Memo Body");
		localRepo.deleteMemo("1");
		
		MemoRepository remoteRepo = new RemoteRepositotry();
		remoteRepo.addMemo("2", "Remote Memo Body");
		remoteRepo.getMemo();
		remoteRepo.updateMemo("2", "Updated Remote Memo Body");
		remoteRepo.deleteMemo("2");
	}

}
