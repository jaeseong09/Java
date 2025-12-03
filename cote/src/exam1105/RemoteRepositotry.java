package exam1105;

public class RemoteRepositotry implements MemoRepository{

	@Override
	public void addMemo(String id, String body) {
		System.out.println("서버에 메모가 저장 되었습니다.");
	}

	@Override
	public void getMemo() {
		System.out.println("서버에 저장된 메모를 가져왔습니다.");		
	}

	@Override
	public void updateMemo(String id, String body) {
  		System.out.println("서버에 저장된 메모가 수정되었습니다.");		
	}

	@Override
	public void deleteMemo(String id) {
		System.out.println("서버에 저장된 메모가 삭제되었습니다.");		
	}

}
