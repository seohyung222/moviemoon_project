package com.mycompany.myapp.dto;

public class PageDTO {
	
	private int page = 1;		 		//현재 페이지번호 -default 1페이지 
	private int perPageNum; 		    // 한 화면에 보여지는 데이터 갯수
	private int totalCount;		 		// 총 페이지 갯수
	private int startPage; 		 		// 시작페이지 번호
	private int endPage;		 		// 끝 페이지 번호
	private boolean prev;		 		// 이전
	private boolean next;				// 다음
	private int displayPageNum = 5;	// 한 화면의 페이지 번호 갯수
    private int tempEndPage;			// 마지막 끝 페이지 번호
    private String keyword;				// 검색키워드
    
    public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getDisplayPageNum() {
		return displayPageNum;
	}
	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
	public int getTempEndPage() {
		return tempEndPage;
	}
	public void setTempEndPage(int tempEndPage) {
		this.tempEndPage = tempEndPage;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public int getTotalCount() {
		return totalCount;
	}
	
	public PageDTO(int page, int perPageNum, int totalCount, int startPage, int endPage, boolean prev, boolean next,
			int displayPageNum, int tempEndPage, String keyword) {
		this.page = page;
		this.perPageNum = perPageNum;
		this.totalCount = totalCount;
		this.startPage = startPage;
		this.endPage = endPage;
		this.prev = prev;
		this.next = next;
		this.displayPageNum = displayPageNum;
		this.tempEndPage = tempEndPage;
		this.keyword = keyword;
	}
	
	public PageDTO() {
	}
	
	@Override
	public String toString() {
		return "PageDTO [page=" + page + ", perPageNum=" + perPageNum + ", totalCount=" + totalCount + ", startPage="
				+ startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next + ", displayPageNum="
				+ displayPageNum + ", tempEndPage=" + tempEndPage + ", keyword=" + keyword + "]";
	}
	
	public PageDTO(int page, int perPageNum) {
    	this.page = page;
		this.perPageNum = perPageNum;
		
		System.out.println("PageDTO page:" + page);
		System.out.println("PageDTO perPageNum:" + perPageNum);
		
    }
                                             //mapper-프로퍼티이름
    public int getPageStart() {   // limit #{pageStart},10 
    	
    	System.out.println("getPageStart() invoked");
    	System.out.println( (this.page-1) * perPageNum);
    	return (this.page-1) * perPageNum;
    }
    
	
	/*
	 * public void setPage(int page) {
	 * 
	 * System.out.println("setPage(int page) invoked");
	 * 
	 * if(page<=0) { this.page = 1; } else { this.page = page; } }
	 */
	 
    
    public void setPerPageNum(int pageCount) {
    	
    	System.out.println("setPerPageNum(int pageCount) invoked");
    	System.out.println(pageCount);
    	
		int cnt = this.perPageNum;
		System.out.println("cnt:" + cnt);
		
		if(pageCount != cnt) {
			this.perPageNum = cnt;
		}
		else {
			this.perPageNum = pageCount;
		}
	}
    
    public void setTotalCount(int totalCount) {
    	this.totalCount = totalCount;
    	pageingData();
    }
    
    public void pageingData() {
    	  
    	System.out.println("thispage:"+ this.page);
    	System.out.println("displayPageNum:" + displayPageNum);
            //ex) endPage -->  Math.ceil(1/5, 2/5, 3/5, 4/5, 5/5) *5  --> 5
    	endPage = (int) (Math.ceil(this.page / (double) displayPageNum)) *displayPageNum;  
       
    	    //ex startPage --> (5-5)+1 -> 1 ,  (10-5)+1 -> 2 , ....
                             // 1~5 -> 시작페이지=1  , 6~10 ->시작페이지=2 ...
    	startPage = (endPage - displayPageNum) + 1;
           
        
        System.out.println("endPage:" +endPage);
        System.out.println("startPage" + startPage);
        System.out.println("totalCount:" + totalCount);
        int tempEndPage = (int) (Math.ceil(totalCount / (double) this.perPageNum));
        
        System.out.println("tempEndPage:" + tempEndPage);
        
        if (endPage > tempEndPage) {
        	    System.out.println("endPage > tempEndPage");
        	    System.out.println("endPage:"+ endPage);
            endPage = tempEndPage;
        }
        
        prev = startPage == 1 ? false : true; //이전 페이지 유무 설정
        next = endPage * this.perPageNum >= totalCount ? false : true; //다음 페이지 유무 설정
    }
    
}
