package kr.co.tjoeun.a20191201_03_kotlinsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Size
import kr.co.tjoeun.a20191201_03_kotlinsyntax.Datas.User
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoNumArr = ArrayList<Int>()

        lottoNumArr.add(10)
        lottoNumArr.add(42)
        lottoNumArr.add(17)
        lottoNumArr.add(0,15)





        Log.d("42는몇번칸에?","${lottoNumArr.indexOf(42)} 번 칸에 있음")

        Log.d("1번 칸에는 뭐가들어있나?","${lottoNumArr.get(1)}")

//      42를 배열에서 빼내고 싶다.
        lottoNumArr.remove(42)
        Log.d("로또번호입력한갯수", "${lottoNumArr.size} 개 입력 됨")


//        맨 앞 자료 삭제.
        lottoNumArr.removeAt(0)

        val userList = ArrayList<User>()

        val user1 = User()
        user1.name = "조경진"
        user1.loginId = "cho881020"

        userList.add(user1)

        val user2 = User()
        user2.name = "계석준"
        user2.loginId = "student1"

        userList.add(user2)

        Log.d("들어있는사람수", "${userList.size} 명" )
        Log.d("1번칸에 있는 사람이름", "${userList.get(1).name}")

//
//        val user3 = User()
//        user3.name = "조경진"
//        user3.loginId = "cho881020"
//
//        Log.d("조경진이 있는 위치","${userList.indexOf(user3)}")

        val user4 = User()
        user4.name = "김미현"
        user4.loginId = "student2"



//        var count = 0
//        while (true) {
//
//            count++
//
//            if(count >= 10) {
//                break
//            }
//        }


//        사용자 목록에 들어있는 사람들의 이름 /아이디 출력

        for (user in userList) {
            Log.d("사람이름/아이디", "${user.name} / ${user.loginId}")
        }

    }
}
