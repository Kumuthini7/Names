package com.example.myapplication.test.names


/**
 * Created by Kumuthini.N on 10-08-2020
 */

/*
class MainAdapter : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    private var context: Context? = null
    private var features: List<NameList?>? = null


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder? {
        val mInflater = LayoutInflater.from(viewGroup.context)
        return when (viewType) {
            1 -> {
                val vGroupImage = mInflater.inflate(
                    R.layout.fragment_main_item_letter,
                    viewGroup,
                    false
                ) as ViewGroup
                ViewHolderLetter(vGroupImage)
            }
            else -> {
                val vGroupText2 = mInflater.inflate(
                    R.layout.fragment_main_item,
                    viewGroup,
                    false
                ) as ViewGroup
                ViewHolderMember(vGroupText2)
            }
        }
    }


*/
/*
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_main_item, parent, false)
        return ViewHolder(view)
    }
*//*


    override fun getItemViewType(position: Int): Int {
        var viewType = 0
        if (features?.get(position)?.type === 1) {
            viewType = 1
        } else if (features?.get(position)?.type === 2) {
            viewType = 2
        }
        return viewType
    }



*/
/*
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            1 -> {
                val headerViewHolder = holder as ViewHolderLetter
                headerViewHolder.bindView()
            }
            2 -> {
                val headerViewHolder = holder as ViewHolderMember
                headerViewHolder.bindView(listOfMovies[position - 1])
            }
        }
    }
*//*



    override fun getItemCount(): Int = features?.size ?: 0

    fun update(
        context: Context,
        it1: ArrayList<NameList>?
    ) {
        this.context = context
        this.features = it1
        notifyDataSetChanged()

    }

*/
/*
    class HeaderViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        fun bindView(){
            itemView.text="Header Section"
        }
    }
*//*


    inner class ViewHolderMember(val mView: View) : RecyclerView.ViewHolder(mView) {
        val type: TextView = mView.type

        override fun toString(): String {
            return super.toString() + " '" + type.text + "'"
        }
    }
    inner class ViewHolderLetter(val mView: View) : RecyclerView.ViewHolder(mView) {
        val type: TextView = mView.type

        override fun toString(): String {
            return super.toString() + " '" + type.text + "'"
        }
    }
}
*/
