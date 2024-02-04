package com.example.profilecardui.data

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.ViewModel
import com.example.profilecardui.R

class ProfileCardViewModel : ViewModel() {
    val userProfiles: List<User> by lazy {
        listOf(
            User(
                shortName = "Craig",
                fullName = "Craig McKay",
                age = 25,
                company = "Unsplash",
                bio = "Dedicated photographer capturing life's essence through lens and light. Passionate about freezing moments that tell compelling stories. My images aim to evoke emotion and highlight the beauty in every frame. Join me on a visual journey where each click narrates a unique story of life's poetry.",
                imgSrc = R.drawable.craig_mckay_jmurdhtm7ng_unsplash,
                occupation = "Photographer",
                mail = "craig.mckay@unsplash.com"
            ),
            User(
                shortName = "Johana",
                fullName = "Louisiana Johana",
                age = 20,
                company = "Google",
                bio = "Innovative UX/UI designer crafting seamless digital experiences with creativity and empathy. I merge aesthetics and functionality to elevate user interactions. Let's create intuitive and delightful designs that leave a lasting impression in the digital world.",
                imgSrc = R.drawable.woman,
                occupation = "UX/UI",
                mail = "louisiana.johana@google.com"
            ),
            User(
                shortName = "Winegeart",
                fullName = "Karsten Winegeart",
                age = 22,
                company = "CISCO",
                bio = "Proactive Cyber Analyst adept at detecting and countering threats. Committed to fortifying digital security through continuous analysis and swift mitigation. Dedicated to staying ahead in the evolving cyber security landscape for robust defense.",
                imgSrc = R.drawable.karsten_winegeart_ksqffhthpro_unsplash,
                occupation = "Cyber Analyst",
                mail = "winegeart231@cisco.com"
            ),
            User(
                shortName = "Hladynets",
                fullName = "Vicky Hladynets",
                age = 28,
                company = "META",
                bio = "Creative Frontend Developer turning ideas into sleek and user-friendly web experiences. Proficient in modern frameworks, I bring a blend of design and functionality to the forefront. Committed to crafting responsive and intuitive designs.",
                imgSrc = R.drawable.vicky_hladynets_c8ta0gwpbqg_unsplash,
                occupation = "Frontend Developer",
                mail = "hladynets.vicky@meta.com"
            )
        )
    }

    val friends: List<User> by lazy {
        listOf(
            User(
                shortName = "Christopher",
                fullName = "Christopher O.",
                age = 25,
                company = "Freelancer",
                bio = "Creative Frontend Developer turning ideas into sleek and user-friendly web experiences. Proficient in modern frameworks, I bring a blend of design and functionality to the forefront. Committed to crafting responsive and intuitive designs.",
                imgSrc = R.drawable.christopher,
                occupation = "Frontend Developer",
                mail = "christopherodhiambo254@gmail.com"
            ),
            User(
                shortName = "Johana",
                fullName = "Louisiana Johana",
                age = 20,
                company = "Google",
                bio = "Innovative UX/UI designer crafting seamless digital experiences with creativity and empathy. I merge aesthetics and functionality to elevate user interactions. Let's create intuitive and delightful designs that leave a lasting impression in the digital world.",
                imgSrc = R.drawable.woman,
                occupation = "UX/UI",
                mail = "louisiana.johana@google.com"
            ),
            User(
                shortName = "Winegeart",
                fullName = "Karsten Winegeart",
                age = 22,
                company = "CISCO",
                bio = "Proactive Cyber Analyst adept at detecting and countering threats. Committed to fortifying digital security through continuous analysis and swift mitigation. Dedicated to staying ahead in the evolving cyber security landscape for robust defense.",
                imgSrc = R.drawable.karsten_winegeart_ksqffhthpro_unsplash,
                occupation = "Cyber Analyst",
                mail = "winegeart231@cisco.com"
            ),
            User(
                shortName = "Craig",
                fullName = "Craig McKay",
                age = 25,
                company = "Unsplash",
                bio = "Dedicated photographer capturing life's essence through lens and light. Passionate about freezing moments that tell compelling stories. My images aim to evoke emotion and highlight the beauty in every frame. Join me on a visual journey where each click narrates a unique story of life's poetry.",
                imgSrc = R.drawable.craig_mckay_jmurdhtm7ng_unsplash,
                occupation = "Photographer",
                mail = "craig.mckay@unsplash.com"
            ),
        )
    }
}