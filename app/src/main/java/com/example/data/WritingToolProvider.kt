package com.example.data

data class WritingTool(
    val id: Int,
    val part: String,
    val partId: Int,
    val title: String,
    val subtitle: String,
    val explanation: String,
    val workshop: List<String>
)

object WritingToolProvider {
    val tools = listOf(
        // PART 1: NUTS AND BOLTS
        WritingTool(
            id = 1,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Begin sentences with subjects and verbs.",
            subtitle = "Make meaning early, then let weaker elements branch to the right.",
            explanation = "In English, a sentence stretches from left to right. Master writers craft page after page of sentences written with subject and verb at the beginning followed by other subordinate elements. This creates a right-branching sentence.",
            workshop = listOf(
                "Read through the newspaper with a pencil in hand. Mark the locations of subjects and verbs.",
                "The next time you struggle with a sentence, rewrite it by placing subject and verb at the beginning."
            )
        ),
        WritingTool(
            id = 2,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Order words for emphasis.",
            subtitle = "Place strong words at the beginning and at the end.",
            explanation = "For any sentence, the period acts as a stop sign. That slight pause magnifies the final word. Emphatic word order helps hide weaker elements in the middle and highlights your best stuff at the beginning and the end.",
            workshop = listOf(
                "Read Lincoln's Gettysburg Address and study emphatic word order.",
                "Revise your sentences so that powerful and interesting words appear near the beginning and end."
            )
        ),
        WritingTool(
            id = 3,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Activate your verbs.",
            subtitle = "Strong verbs create action, save words, and reveal the players.",
            explanation = "The power of prose flows from active verbs. If the subject performs the action, the verb is active. Remember to avoid weak verb qualifiers that attach like barnacles.",
            workshop = listOf(
                "Review your writing and categorize your verbs as active, passive, or 'to be'.",
                "Convert passive and 'to be' verbs into active ones where possible."
            )
        ),
        WritingTool(
            id = 4,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Be passive-aggressive.",
            subtitle = "Use passive verbs to showcase the 'victim' of action.",
            explanation = "While active verbs are standard, passive verbs are useful when you want to call attention to the receiver of the action. When writing about victims, passive voice highlights their lack of agency.",
            workshop = listOf(
                "Read Orwell's 'Politics and the English Language' regarding the passive voice.",
                "Revise passive verbs into the active to see how the emphasis changes."
            )
        ),
        WritingTool(
            id = 5,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Watch those adverbs.",
            subtitle = "Use them to change the meaning of the verb.",
            explanation = "At their best, adverbs spice up a verb or adjective. At their worst, they express a meaning already contained within it (e.g., 'smiled happily'). Use them sparingly but effectively.",
            workshop = listOf(
                "Find any word ending in -ly in your writing, cross it out, and see if the sentence works better.",
                "Search for weak verb-adverb combinations and upgrade to a stronger verb."
            )
        ),
        WritingTool(
            id = 6,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Take it easy on the -ings.",
            subtitle = "Prefer the simple present or past.",
            explanation = "Too many -ing action words can weaken your prose. When you add -ing, you add a syllable, and the words begin to resemble each other. The simple present or past tense usually suffices.",
            workshop = listOf(
                "Circle any word that ends with -ing in your recent work. Do you use too many?",
                "Revise a few passages to use simple present or past tense instead."
            )
        ),
        WritingTool(
            id = 7,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Fear not the long sentence.",
            subtitle = "Take the reader on a journey of language and meaning.",
            explanation = "Mastering the long sentence allows you to take readers on an immersive journey. It helps if the subject and verb come early, creating momentum for the rest of the elements.",
            workshop = listOf(
                "Keep an eye out for well-crafted long sentences and study their structure.",
                "Combine shorter sentences for a richer variety of lengths in your writing."
            )
        ),
        WritingTool(
            id = 8,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Establish a pattern, then give it a twist.",
            subtitle = "Build parallel constructions, but cut across the grain.",
            explanation = "Parallel grammatical structures make ideas simpler to grasp. However, breaking a parallel pattern at the end—a twist—can add emphasis or a humorous imbalance.",
            workshop = listOf(
                "Examine your recent work for parallel structures. Look for accidental potholes.",
                "Fiddle with parallel structures deliberately to discover the effect of a twist."
            )
        ),
        WritingTool(
            id = 9,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Let punctuation control pace and space.",
            subtitle = "Learn the rules, but realize you have more options than you think.",
            explanation = "Punctuation sets the pace of reading and divides ideas. A period is a stop sign, a comma is a speed bump, a semicolon is a rolling stop. Use them purposely to control the flow.",
            workshop = listOf(
                "Take an old piece, repunctuate it, and read aloud to feel the pacing changes.",
                "Use varied punctuation deliberately to speed up or slow down the reader."
            )
        ),
        WritingTool(
            id = 10,
            part = "Nuts and Bolts",
            partId = 1,
            title = "Cut big, then small.",
            subtitle = "Prune the big limbs, then shake out the dead leaves.",
            explanation = "Brevity comes from selection and pruning. First, cut entire passages that don't support your focus. Then, target weak quotations, repeated prepositions, and unnecessary adverbs.",
            workshop = listOf(
                "Review your work and cut without mercy. Begin with big cuts, then smaller ones.",
                "Calculate your word savings and try to cut 15 percent of a draft."
            )
        ),

        // PART 2: SPECIAL EFFECTS
        WritingTool(
            id = 11,
            part = "Special Effects",
            partId = 2,
            title = "Prefer the simple over the technical.",
            subtitle = "Use shorter words, sentences, and paragraphs at points of complexity.",
            explanation = "Make hard facts easy reading. Simplify the prose when explaining complex technical matters to help readers comprehend it, rather than burying them in jargon.",
            workshop = listOf(
                "Review unclear writing (like a legal contract) to see how length hinders meaning.",
                "Revise one of your complex pieces to use shorter words and simpler sentences."
            )
        ),
        WritingTool(
            id = 12,
            part = "Special Effects",
            partId = 2,
            title = "Give key words their space.",
            subtitle = "Do not repeat a distinctive word unless you intend a specific effect.",
            explanation = "Give distinctive words 'word territory.' Unless you are doing it for rhythm or a powerful echoing effect, spreading out repetitive phrasing gives language more impact.",
            workshop = listOf(
                "Read an old piece of your writing to catch unintended repetition.",
                "Identify when authors use repetition purposely to link themes."
            )
        ),
        WritingTool(
            id = 13,
            part = "Special Effects",
            partId = 2,
            title = "Play with words, even in serious stories.",
            subtitle = "Choose words the average writer avoids but the average reader understands.",
            explanation = "A rich writing vocabulary doesn't require pretentious words, just precise and vivid ones. Use your vocabulary intentionally to surprise the reader and make statements memorable.",
            workshop = listOf(
                "Circle surprising or playful word choices in everyday news stories.",
                "Unleash your writing vocabulary in a new draft and test it with readers."
            )
        ),
        WritingTool(
            id = 14,
            part = "Special Effects",
            partId = 2,
            title = "Get the name of the dog.",
            subtitle = "Dig for the concrete and specific, details that appeal to the senses.",
            explanation = "Telling details lead to deep understanding. Concrete details don’t just decorate a story; they transport the reader directly into the experience.",
            workshop = listOf(
                "Read a newspaper or novel looking for passages that appeal strongly to the senses.",
                "In your next work, use specific details for smell, sound, taste, and touch."
            )
        ),
        WritingTool(
            id = 15,
            part = "Special Effects",
            partId = 2,
            title = "Pay attention to names.",
            subtitle = "Interesting names attract the writer—and the reader.",
            explanation = "Names provide backstory and character. Keep your eyes open for fascinating names and use them to reveal identity, inheritance, and personality.",
            workshop = listOf(
                "Keep a daybook record of interesting character and place names you discover.",
                "Incorporate true historical or meaningful names instead of generic placeholders."
            )
        ),
        WritingTool(
            id = 16,
            part = "Special Effects",
            partId = 2,
            title = "Seek original images.",
            subtitle = "Reject clichés and first-level creativity.",
            explanation = "Avoid worn-out metaphors like 'white as snow.' Push past your first ideas (first-level creativity) to find fresh, evocative images that surprise the reader.",
            workshop = listOf(
                "Circle the clichés in your work and brainstorm strong, fresh alternatives.",
                "Try writing entirely straight/factual variations if you can't find a great original image."
            )
        ),
        WritingTool(
            id = 17,
            part = "Special Effects",
            partId = 2,
            title = "Riff on the creative language of others.",
            subtitle = "Make word lists, free-associate, be surprised by language.",
            explanation = "Almost all inventions come out of associative imagination. Play with familiar slogans, titles, or catchphrases to create a fresh narrative spin.",
            workshop = listOf(
                "Look for apt phrases in your reading and 'riff' off them with a friend.",
                "Track the origin of striking phrases to see how ideas evolve."
            )
        ),
        WritingTool(
            id = 18,
            part = "Special Effects",
            partId = 2,
            title = "Set the pace with sentence length.",
            subtitle = "Vary sentences to influence the reader's speed.",
            explanation = "Sentence length shapes the rhythm. Long sentences provide a steady flow, while quick, short strings of sentences slam on the brakes to create tension.",
            workshop = listOf(
                "Combine or split sentences in a draft to establish a rhythm that suits your topic.",
                "Notice sentence lengths and speeds in the works of your favorite authors."
            )
        ),
        WritingTool(
            id = 19,
            part = "Special Effects",
            partId = 2,
            title = "Vary the lengths of paragraphs.",
            subtitle = "Go short or long—or make a turn—to match your intent.",
            explanation = "A paragraph is a unit of thought. Long paragraphs give you space to expand on ideas, while a one-sentence paragraph forces a dramatic pause.",
            workshop = listOf(
                "Break long, solid paragraphs into smaller, varied units to give readers breathing room.",
                "Look for paragraphs in your reading that make a deliberate 'turn' in the middle."
            )
        ),
        WritingTool(
            id = 20,
            part = "Special Effects",
            partId = 2,
            title = "Choose the number of elements with a purpose in mind.",
            subtitle = "One, two, three, or four: each sends a secret message to the reader.",
            explanation = "Use one for declarative power. Use two for comparison and contrast. Use three for a sense of completeness. Use four or more to build an expansive, overwhelming list.",
            workshop = listOf(
                "Examine your use of examples and numbers. Would adding or removing one change the effect?",
                "Play with listing items to see how the rhythm shifts at three versus four."
            )
        ),
        WritingTool(
            id = 21,
            part = "Special Effects",
            partId = 2,
            title = "Know when to back off and when to show off.",
            subtitle = "When the topic is most serious, understate; when least serious, exaggerate.",
            explanation = "If the topic is grave (like 9/11 or a tragedy), pull back and let the powerful facts speak for themselves. If the topic is light or playful, feel free to use colorful, hyperactive prose.",
            workshop = listOf(
                "Review tragedies in the news and notice how the best are written with restraint.",
                "Read humor writers and look for examples of hyperbole and exaggeration."
            )
        ),
        WritingTool(
            id = 22,
            part = "Special Effects",
            partId = 2,
            title = "Climb up and down the ladder of abstraction.",
            subtitle = "Learn when to show, when to tell, and when to do both.",
            explanation = "Moving between concrete objects ('bloody knife') and abstract ideas ('justice') creates depth. Good writing continually moves up and down this ladder.",
            workshop = listOf(
                "Find essays stuck in the middle (bureaucratic jargon) and identify what research is needed to climb down.",
                "Look for concrete images in your draft and try to reveal their higher 'abstract' meaning."
            )
        ),
        WritingTool(
            id = 23,
            part = "Special Effects",
            partId = 2,
            title = "Tune your voice.",
            subtitle = "Read stories aloud.",
            explanation = "Voice is the illusion of a writer speaking directly to a reader. The most effective way to test your voice, pacing, and tone is to read your work out loud.",
            workshop = listOf(
                "Read your writing aloud to a friend and ask, 'Does this sound like me?'",
                "Define your writing voice with adjectives and find the evidence in your text."
            )
        ),

        // PART 3: BLUEPRINTS
        WritingTool(
            id = 24,
            part = "Blueprints",
            partId = 3,
            title = "Work from a plan.",
            subtitle = "Index the big parts of your work.",
            explanation = "Organizing your material into distinct sections helps you and the reader. Use a formal outline, a reverse outline, or simply sketch the big structural pieces.",
            workshop = listOf(
                "Take the longest piece you've written recently and manually mark and label its parts.",
                "Observe how other writers use subheadings to define their structure."
            )
        ),
        WritingTool(
            id = 25,
            part = "Blueprints",
            partId = 3,
            title = "Learn the difference between reports and stories.",
            subtitle = "Use one to render information, the other to render experience.",
            explanation = "Reports transfer knowledge using Who, What, Where, When. Stories create an experience transforming these into Character, Action, Setting, and Chronology.",
            workshop = listOf(
                "Look for missed narrative opportunities embedded in straight news reports.",
                "Review your work and see if you can add story elements to basic information."
            )
        ),
        WritingTool(
            id = 26,
            part = "Blueprints",
            partId = 3,
            title = "Use dialogue as a form of action.",
            subtitle = "Dialogue advances narrative; quotes delay it.",
            explanation = "Quotes comment on the action, telling us what happened. Dialogue occurs within the action, showing us the characters interacting in real-time.",
            workshop = listOf(
                "Listen to public conversations and jot down notes to capture authentic speech.",
                "Identify missed opportunities in your work where dialogue could have replaced flat quotes."
            )
        ),
        WritingTool(
            id = 27,
            part = "Blueprints",
            partId = 3,
            title = "Reveal traits of character.",
            subtitle = "Show characteristics through scenes, details, and dialogue.",
            explanation = "Avoid relying solely on abstract adjectives like 'compassionate' or 'brave.' Demonstrate character through actions, possessions, statements, and specific behaviors.",
            workshop = listOf(
                "Identify your character's dominant trait, then describe a scene that proves it visually.",
                "Observe people in public and list specific physical details that reveal their personalities."
            )
        ),
        WritingTool(
            id = 28,
            part = "Blueprints",
            partId = 3,
            title = "Put odd and interesting things next to each other.",
            subtitle = "Help the reader learn from contrast.",
            explanation = "Ironic juxtaposition places two disparate things side by side so they comment on each other, heightening humor, tragedy, or tension.",
            workshop = listOf(
                "Review your photos or observations for startling juxtapositions.",
                "Revise your work to bring contrasting themes, actions, or words directly next to each other."
            )
        ),
        WritingTool(
            id = 29,
            part = "Blueprints",
            partId = 3,
            title = "Foreshadow dramatic events and powerful conclusions.",
            subtitle = "Plant important clues early.",
            explanation = "Like 'Chekhov's Gun', items or concepts planted early in a piece provide an advance indication of later, significant events, rewarding careful readers.",
            workshop = listOf(
                "Ensure you don't violate Chekhov's Gun by leaving significant early details unresolved.",
                "Visualize the end of your story and plant a subtle clue in the beginning."
            )
        ),
        WritingTool(
            id = 30,
            part = "Blueprints",
            partId = 3,
            title = "To generate suspense, use internal cliffhangers.",
            subtitle = "To propel readers, make them wait.",
            explanation = "Internal cliffhangers at the end of paragraphs or chapters leave the outcome momentarily unresolved, propelling the reader further into the text.",
            workshop = listOf(
                "Observe how TV dramas use commercial breaks as internal cliffhangers.",
                "Try placing a mini-cliffhanger right before a page break or chapter transition."
            )
        ),
        WritingTool(
            id = 31,
            part = "Blueprints",
            partId = 3,
            title = "Build your work around a key question.",
            subtitle = "Stories need an engine, a question that the action answers for the reader.",
            explanation = "Every narrative needs an 'engine'—an unresolved question. 'Will the hero escape?' or 'Who committed the crime?' that continually pulls the reader forward.",
            workshop = listOf(
                "Review your recent stories and identify their core engine or question.",
                "Find underdeveloped stories in the news that would benefit from a narrative engine."
            )
        ),
        WritingTool(
            id = 32,
            part = "Blueprints",
            partId = 3,
            title = "Place gold coins along the path.",
            subtitle = "Reward the reader with high points, especially in the middle.",
            explanation = "A 'gold coin' is an anecdote, stunning fact, or brilliant quote that rewards readers for sticking with you through the middle parts of a long narrative.",
            workshop = listOf(
                "Check if your writing is 'top-heavy' and balance it by moving a great moment to the middle.",
                "Highlight the 'gold coins' in your draft and ensure they are paced well."
            )
        ),
        WritingTool(
            id = 33,
            part = "Blueprints",
            partId = 3,
            title = "Repeat, repeat, and repeat.",
            subtitle = "Purposeful repetition links the parts.",
            explanation = "While clumsy redundancy is bad, purposeful repetition establishes a rhythm or a thematic refrain that ties disparate parts of a story together.",
            workshop = listOf(
                "Learn the difference between redundant filler words and purposeful thematic repetition.",
                "Use repetition to underscore an argument or deep emotion in an essay."
            )
        ),
        WritingTool(
            id = 34,
            part = "Blueprints",
            partId = 3,
            title = "Write from different cinematic angles.",
            subtitle = "Turn your notebook into a camera.",
            explanation = "Think like a filmmaker. Use 'aerial views' for wide geography, 'establishing shots', 'middle distance' for standard action, and 'close-ups' for emotional truth.",
            workshop = listOf(
                "Review a recent piece to see your default camera angle. Are you stuck in the middle distance?",
                "Take photos from extreme distances and close-ups, then translate them into text."
            )
        ),
        WritingTool(
            id = 35,
            part = "Blueprints",
            partId = 3,
            title = "Report and write for scenes.",
            subtitle = "Then align them in a meaningful sequence.",
            explanation = "The scene is the basic unit of narrative experience. Provide setting, character interaction, and dialogue rather than just summarized history, then sequence them carefully.",
            workshop = listOf(
                "Record real-world scenes in detail when you observe them.",
                "Study how film directors organize a sequence of scenes to build a narrative arc."
            )
        ),
        WritingTool(
            id = 36,
            part = "Blueprints",
            partId = 3,
            title = "Mix narrative modes.",
            subtitle = "Combine story forms using the broken line.",
            explanation = "Move back and forth between telling a compelling experiential story and stopping to provide crucial background analysis, context, or technical information.",
            workshop = listOf(
                "Identify where you used an 'anecdote lead' and ensure the required 'nut graf' explains it.",
                "Practice the 'broken line' method by alternating between narrative action and contextual analysis."
            )
        ),
        WritingTool(
            id = 37,
            part = "Blueprints",
            partId = 3,
            title = "In short works, don’t waste a syllable.",
            subtitle = "Shape short writing with wit and polish.",
            explanation = "Short formats (summaries, photo captions, haikus, news briefs) must be tightly polished. Their compression magnifies the impact of every individual word.",
            workshop = listOf(
                "Find your shortest piece of writing and revise it, scrutinizing every single syllable.",
                "Practice writing dense, witty photo captions for news images."
            )
        ),
        WritingTool(
            id = 38,
            part = "Blueprints",
            partId = 3,
            title = "Prefer archetypes to stereotypes.",
            subtitle = "Use subtle symbols, not crashing cymbals.",
            explanation = "Archetypes (the journey, overcoming obstacles) offer a deep mythic resonance. Stereotypes rely on shallow, prejudiced generalizations. Use the former, avoid the latter.",
            workshop = listOf(
                "Identify archetypal patterns like 'descent into the underworld' in news reporting.",
                "Check if any symbols you employ are too clumsy or obvious ('crashing cymbals')."
            )
        ),
        WritingTool(
            id = 39,
            part = "Blueprints",
            partId = 3,
            title = "Write toward an ending.",
            subtitle = "Help readers close the circle of meaning.",
            explanation = "Good endings leave a lasting impression. Consider tie-backs to the opening, concluding payoffs, definitive future views, or apt quotes that resolve the story's themes.",
            workshop = listOf(
                "Cover the final paragraph of your piece. Is the story better or worse without it?",
                "Try switching the beginnings and endings of a recent story."
            )
        ),

        // PART 4: USEFUL HABITS
        WritingTool(
            id = 40,
            part = "Useful Habits",
            partId = 4,
            title = "Draft a mission statement for your work.",
            subtitle = "To sharpen your learning, write about your writing.",
            explanation = "Before writing a major piece, write a short statement outlining your goals, format, and themes. This sets your trajectory and keeps you aligned with your core purpose.",
            workshop = listOf(
                "Write a short, tentative mission statement for your next large project.",
                "Review an old, successful piece and retroactively write a mission statement for it."
            )
        ),
        WritingTool(
            id = 41,
            part = "Useful Habits",
            partId = 4,
            title = "Turn procrastination into rehearsal.",
            subtitle = "Plan and write it first in your head.",
            explanation = "Instead of feeling guilty for delaying, use the time to mentally rehearse your leads, themes, or structures. Lower your initial standards to conquer writer's block.",
            workshop = listOf(
                "During your 'delay' periods, write a quick, zero-stakes summary memo to yourself.",
                "Try writing for exactly three minutes as fast as you can to break the inertia."
            )
        ),
        WritingTool(
            id = 42,
            part = "Useful Habits",
            partId = 4,
            title = "Do your homework well in advance.",
            subtitle = "Prepare yourself for the expected—and unexpected.",
            explanation = "Read, research, and collect data before the deadline hits. You never know when knowledge stored in advance will provide the perfect angle or detail on a tight deadline.",
            workshop = listOf(
                "List big potential writing projects and slowly begin background homework.",
                "Observe live news events and mentally rehearse how you'd format the story on deadline."
            )
        ),
        WritingTool(
            id = 43,
            part = "Useful Habits",
            partId = 4,
            title = "Read for both form and content.",
            subtitle = "Examine the machinery beneath the text.",
            explanation = "'X-ray reading' means peering beneath a story to see *how* it was constructed—its word choices, pacing, and architecture—not just *what* it is about.",
            workshop = listOf(
                "Read several works by a favorite author and X-ray them with a friend.",
                "Examine a publication outside your usual interests strictly for its style and format."
            )
        ),
        WritingTool(
            id = 44,
            part = "Useful Habits",
            partId = 4,
            title = "Save string.",
            subtitle = "For big projects, save scraps others would toss.",
            explanation = "Gather fragments, anecdotes, articles, and observations over time. These 'scraps' might look insignificant alone, but accumulated, they form the foundation of major works.",
            workshop = listOf(
                "Create a physical or digital folder for a broad topic of interest and start saving scraps.",
                "Review the collected themes in your daybook once a month to see if a story is emerging."
            )
        ),
        WritingTool(
            id = 45,
            part = "Useful Habits",
            partId = 4,
            title = "Break long projects into parts.",
            subtitle = "Then assemble the pieces into something whole.",
            explanation = "Taking a project 'bird by bird' prevents you from being overwhelmed by the entire scope. Break books into chapters, chapters into sections, and write the small parts.",
            workshop = listOf(
                "Write down the structural sub-components of a large project before drafting.",
                "Study the table of contents of major books to observe how other writers segment work."
            )
        ),
        WritingTool(
            id = 46,
            part = "Useful Habits",
            partId = 4,
            title = "Take an interest in all crafts that support your work.",
            subtitle = "To do your best, help others do their best.",
            explanation = "Embrace the collaborative reality of publication. Engage with copyeditors, designers, photographers, and developers to ensure your work shines in its final format.",
            workshop = listOf(
                "Identify the key collaborators in your publishing process.",
                "Ask a designer or editor what you can do locally to make their job easier."
            )
        ),
        WritingTool(
            id = 47,
            part = "Useful Habits",
            partId = 4,
            title = "Recruit your own support group.",
            subtitle = "Create a corps of helpers for feedback.",
            explanation = "Don't write entirely in isolation. Build a reliable network of cheerleaders, topic experts, meticulous editors, and interference-runners who can aid you during the process.",
            workshop = listOf(
                "Identify specific people who can serve multiple feedback roles in your network.",
                "Acknowledge and thank someone who recently provided invaluable critique on your draft."
            )
        ),
        WritingTool(
            id = 48,
            part = "Useful Habits",
            partId = 4,
            title = "Limit self-criticism in early drafts.",
            subtitle = "Turn it loose during revision.",
            explanation = "Let your ideas flow without constraint or perfectionism on the first pass to keep the 'Watcher at the Gate' at bay. Bring the critical eye online only for the revisions.",
            workshop = listOf(
                "Make a list of the negative feedback your internal critic whispers, then throw the list away.",
                "To fool the Watcher, try drafting a difficult story as an informal letter to a friend."
            )
        ),
        WritingTool(
            id = 49,
            part = "Useful Habits",
            partId = 4,
            title = "Learn from your critics.",
            subtitle = "Tolerate even unreasonable criticism.",
            explanation = "Instead of fiercely defending your drafts against feedback, turn the argument into a conversation. State your creative intention, and objectively gauge if you succeeded.",
            workshop = listOf(
                "Write down a harsh piece of criticism you received and find the useful lesson within it.",
                "When receiving feedback, resist the urge to defend; explain what you *intended* to do."
            )
        ),
        WritingTool(
            id = 50,
            part = "Useful Habits",
            partId = 4,
            title = "Own the tools of your craft.",
            subtitle = "Build a writing workbench to store your tools.",
            explanation = "Writing is a process of rational steps: sniffing around, exploring ideas, collecting evidence, finding a focus, drafting, and revising. Collect your skills into an organized toolkit.",
            workshop = listOf(
                "Draw a physical diagram mapping out your personal writing process.",
                "Diagnose a piece of your writing that failed by identifying which process step broke down."
            )
        ),

        // PART 5: BONUS TOOLS
        WritingTool(
            id = 51,
            part = "Bonus Tools",
            partId = 5,
            title = "Take advantage of narrative numbers.",
            subtitle = "Let the clock tick or the room number show.",
            explanation = "Numbers aren't just for math; they embed cultural truth and narrative structure. Think of '007', specific countdown clocks for suspense, or symbolic room numbers in stories.",
            workshop = listOf(
                "List your favorite significant numbers and explain their narrative potential.",
                "Use a ticking clock structure in a story to artificially inject pacing and suspense."
            )
        ),
        WritingTool(
            id = 52,
            part = "Bonus Tools",
            partId = 5,
            title = "Express your best thought in the shortest sentence.",
            subtitle = "A short sentence has the ring of gospel truth.",
            explanation = "An extremely short sentence embedded amidst longer paragraphs isolates a pure, powerful truth, granting it immediate authority and focus.",
            workshop = listOf(
                "Identify the thematic core in your draft and reduce it into a micro-sentence for emphasis.",
                "Study famous texts to find single-digit sentences placed at the end of key paragraphs."
            )
        ),
        WritingTool(
            id = 53,
            part = "Bonus Tools",
            partId = 5,
            title = "Match your diction to your writing purpose.",
            subtitle = "Words should fit tone, theme, content, and audience.",
            explanation = "Diction is word choice. Adjust whether you are writing high, formal prose for an elegy or conversational, slang-heavy prose for a cultural critique.",
            workshop = listOf(
                "Compare a high-status broadsheet to a tabloid and list the differences in vocabulary.",
                "Reflect on what your own 'favorite words' say about your personal writing diction."
            )
        ),
        WritingTool(
            id = 54,
            part = "Bonus Tools",
            partId = 5,
            title = "Create a mosaic of detail to reveal character.",
            subtitle = "Piece together habits, gestures, and preferences into a vision of life on the page.",
            explanation = "Gather specific 'status details'—clothing brands, habits, hobbies, postures—and assemble them rather than relying on abstract, tell-don't-show descriptions.",
            workshop = listOf(
                "Draft a scene focusing entirely on the physical details (attire, gestures) of a new character.",
                "Imagine observing yourself as a character and document your own 'status details'."
            )
        ),
        WritingTool(
            id = 55,
            part = "Bonus Tools",
            partId = 5,
            title = "Look for the “inciting incident” to kick-start your story.",
            subtitle = "Attend to the moment that changes a day—or a life.",
            explanation = "Stories require a spark that upsets the daily normalcy and forces the protagonist into action. Discover and amplify this defining incident.",
            workshop = listOf(
                "Review your life history and identify the specific 'inciting incidents'.",
                "Analyze famous movies to accurately identify the singular incident that launches the plot."
            )
        )
    )

    fun getParts(): List<String> = tools.map { it.part }.distinct()
    
    fun getToolsForPart(part: String): List<WritingTool> = tools.filter { it.part == part }

    fun getTool(id: Int): WritingTool? = tools.find { it.id == id }
}
